class swap{
int a=9;
int b=10;
public void swap() {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}
}
