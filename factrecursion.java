class factrecursion{
    int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        factrecursion obj = new factrecursion();
        int result = obj.fact(5);
        System.out.println(result);
    }
}