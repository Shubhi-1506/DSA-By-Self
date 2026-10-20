class ntoonerecursion{
    void print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);
        }
    }
    public static void main(String args[]){
        ntoonerecursion obj = new ntoonerecursion();
        obj.print(5);
    }
}