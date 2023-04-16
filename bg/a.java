package bg.a;

public class a	// class@000b27
{

    public static int a(int p0,int p1){
       if (p1 == 255) {
          return p0;
       }
       if (!p1) {
          return (p0 & 0xffffff);
       }
       return ((p0 & 0xffffff) | ((((p0 >> 24) * (p1 + (p1 >> 7))) >> 8) << 24));
    }
}
