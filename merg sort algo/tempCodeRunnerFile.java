 public class merge_sort {
    public static void merge(int array[],int s,int mid,int e){

        int n1=mid-s+1;
        int n2=e-mid;
        //lefyt array
        int left[]= new int[n1];
        //right array
        int right[]= new int[n2];
        
        //copy value
        int i,j;
        

        for ( i = 0; i < left.length; i++) {
            left[i]= array[s+i-1];
            
        }

     

        for ( j = 0; j < right.length; j++) {
            right[j]= array[mid+j];
            
        }
        i=0;
        j=0;
        for(int k=s;k<e;k++){
            if(left[i]<=right[j]){
                array[k]=left[i];
                i++;
            }
            else{
                array[k]=right[j];
                j++;
            }
        }



    }
    public static void ms(int array[],int s,int e){
        //base case 
        if (s>=e) {
            return;   
        }
        // find mid

        int mid =(s+e)/2;

        // left part sort
        ms(array,s,mid);

        // right part sort
        ms(array,mid+1,e);
        // merge arrays
        merge(array,s,mid,e);
    }
 
    public static void main(String[] args) {
        int array[]={10,9,8,7,6,5,4,3,2,1,0};

        int n=array.length;
        ms(array, 0, n-1);




    }
 }