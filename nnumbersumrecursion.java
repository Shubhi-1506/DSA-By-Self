class nnumbersumrecursion{
    int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String args[]){
        nnumbersumrecursion obj = new nnumbersumrecursion();
        int result = obj.sum(5);
        System.out.println(result);
    }
}