package ga.v0;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import com.contrarywind.view.WheelView;
import fa.a;
import fa.c;
import ga.v0$a;
import ka.b;
import java.util.List;
import aa.b;
import ia.a;

public class v0	// class@00208b
{
    public View a;
    public WheelView b;
    public WheelView c;
    public WheelView d;
    public WheelView e;
    public WheelView f;
    public WheelView g;
    public int h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public WheelView$DividerType v;
    public boolean w;
    public b x;

    public void v0(View p0,boolean[] p1,int p2,int p3){
       super();
       this.j = 1900;
       this.k = 2100;
       this.l = 1;
       this.m = 12;
       this.n = 1;
       this.o = 31;
       this.w = false;
       this.a = p0;
       this.i = p1;
       this.h = p2;
       this.q = p3;
       this.a = p0;
    }
    public String a(){
       StringBuilder str2;
       int currentItem;
       boolean b;
       String str = " ";
       int i = 1;
       String str1 = "-";
       if (this.w != null) {
          str2 = "";
          int i1 = this.b.getCurrentItem() + this.j;
          if (!a.e(i1)) {
             currentItem = this.c.getCurrentItem();
          }else if(((this.c.getCurrentItem() + i) - a.e(i1)) <= 0){
             currentItem = this.c.getCurrentItem();
          }else if(((this.c.getCurrentItem() + i) - a.e(i1)) == i){
             currentItem = this.c.getCurrentItem();
             b = true;
          label_005a :
             int[] ointArray = c.b(i1, currentItem, (this.d.getCurrentItem() + i), b);
             str2 = str2+ointArray[0]+str1+ointArray[i]+str1+ointArray[2]+str;
             str2 = str2+this.e.getCurrentItem()+":";
             str2 = str2+this.f.getCurrentItem()+":";
             return str2+this.g.getCurrentItem();
          }else {
             currentItem = this.c.getCurrentItem();
          label_0059 :
             b = false;
             goto label_005a ;
          }
          currentItem = currentItem + i;
          goto label_0059 ;
       }else {
          str2 = "";
          if (this.p == this.j) {
             v0 tl = this.l;
             if ((this.c.getCurrentItem() + tl) == tl) {
                str2 = str2+(this.b.getCurrentItem() + this.j)+str1;
                str2 = str2+(this.c.getCurrentItem() + this.l)+str1;
                str2 = str2+(this.d.getCurrentItem() + this.n)+str;
                str2 = str2+this.e.getCurrentItem()+":";
                str2 = str2+this.f.getCurrentItem()+":";
                str2 = str2+this.g.getCurrentItem();
             }else {
                str2 = str2+(this.b.getCurrentItem() + this.j)+str1;
                str2 = str2+(this.c.getCurrentItem() + this.l)+str1;
                str2 = str2+(this.d.getCurrentItem() + i)+str;
                str2 = str2+this.e.getCurrentItem()+":";
                str2 = str2+this.f.getCurrentItem()+":";
                str2 = str2+this.g.getCurrentItem();
             }
          }else {
             str2 = str2+(this.b.getCurrentItem() + this.j)+str1;
             str2 = str2+(this.c.getCurrentItem() + i)+str1;
             str2 = str2+(this.d.getCurrentItem() + i)+str;
             str2 = str2+this.e.getCurrentItem()+":";
             str2 = str2+this.f.getCurrentItem()+":";
             str2 = str2+this.g.getCurrentItem();
          }
          return str2;
       }
    }
    public final void b(WheelView p0){
       if (this.x != null) {
          p0.setOnItemSelectedListener(new v0$a(this));
       }
       return;
    }
    public final void c(){
       v0 td = this.d;
       td.setTextSize((float)this.q);
       td = this.c;
       td.setTextSize((float)this.q);
       td = this.b;
       td.setTextSize((float)this.q);
       td = this.e;
       td.setTextSize((float)this.q);
       td = this.f;
       td.setTextSize((float)this.q);
       td = this.g;
       td.setTextSize((float)this.q);
    }
    public void d(int p0,int p1,int p2,int p3,List p4,List p5){
       int currentItem = this.d.getCurrentItem();
       if (p4.contains(String.valueOf(p1))) {
          if (p3 > 31) {
             p3 = 31;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if(p5.contains(String.valueOf(p1))){
          if (p3 > 30) {
             p3 = 30;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if((p0 % 4) || ((p0 % 100) || !(p0 % 400))){
          if (p3 > 29) {
             p3 = 29;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if(p3 > 28){
          p3 = 28;
       }
       this.d.setAdapter(new b(p2, p3));
       if (currentItem > (this.d.getAdapter().getItemsCount() - 1)) {
          this.d.setCurrentItem((this.d.getAdapter().getItemsCount() - 1));
       }
       return;
    }
}
