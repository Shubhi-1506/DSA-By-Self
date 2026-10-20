class functionrevarray
{
    void reversearray(int a[],int n)
    {
        int i;
        System.out.println("The array in reverse order is:");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int n=a.length;
        functionrevarray obj = new functionrevarray();
        obj.reversearray(a,n);
    }
}