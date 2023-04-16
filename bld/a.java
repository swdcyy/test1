package bld.a;
import com.yxcorp.widget.selector.drawable.c;
import com.kuaishou.ax2c.IAttrHost;
import java.lang.Object;
import android.content.res.ColorStateList;

public class a implements c	// class@000273
{
    public IAttrHost a;
    public int[][] b;
    public int[] c;
    public int d;

    public void a(IAttrHost p0){
       super();
       int[][] ointArray = new int[][0];
       this.b = ointArray;
       int[] ointArray1 = new int[0];
       this.c = ointArray1;
       this.a = p0;
    }
    public final void a(IAttrHost p0,int p1,int p2){
       a td = this.d;
       int[] ointArray = new int[]{p2};
       this.b[td] = ointArray;
       p2[td] = p0.getColor(p1, 0);
       this.d = this.d + 1;
    }
    public ColorStateList create(){
       int[][] ointArray = new int[][this.a.getIndexCount()];
       this.b = ointArray;
       int[] ointArray1 = new int[this.a.getIndexCount()];
       this.c = ointArray1;
       int i = 0;
       while (i < this.a.getIndexCount()) {
          int index = this.a.getIndex(i);
          if (index == 2) {
             this.a(this.a, index, 0x101009f);
          }else if(index == 11){
             this.a(this.a, index, -16842911);
          }else if(index == 3){
             this.a(this.a, index, 0x10100a0);
          }else if(index == 12){
             this.a(this.a, index, -16842912);
          }else if(index == 4){
             this.a(this.a, index, 0x101009e);
          }else if(index == 13){
             this.a(this.a, index, -16842910);
          }else if(index == 8){
             this.a(this.a, index, 0x10100a1);
          }else if(index == 17){
             this.a(this.a, index, -16842913);
          }else if(index == 7){
             this.a(this.a, index, 0x10100a7);
          }else if(index == 16){
             this.a(this.a, index, -16842919);
          }else if(index == 6){
             this.a(this.a, index, 0x101009c);
          }else if(index == 15){
             this.a(this.a, index, -16842908);
          }else if(!index){
             this.a(this.a, index, 0x10102fe);
          }else if(index == 9){
             this.a(this.a, index, -16842914);
          }else if(index == 1){
             this.a(this.a, index, 0x10100a2);
          }else if(index == 10){
             this.a(this.a, index, -16843518);
          }else if(index == 5){
             this.a(this.a, index, 0x10100a8);
          }else if(index == 14){
             this.a(this.a, index, -16842920);
          }
          i = i + 1;
       }
       return new ColorStateList(this.b, this.c);
    }
}
