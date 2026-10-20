class onetonrecursion{
    void print(int n){
        if(n>0){
            print(n-1);
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        onetonrecursion obj = new onetonrecursion();
        obj.print(5);
    }
}