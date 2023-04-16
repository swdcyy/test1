package jf.j;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.k;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;

public class j extends a	// class@002402
{

    public void j(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = false;
       boolean b1 = true;
       int i = -1;
       switch (p1.hashCode()){
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i = 0;
             }
             break;
           case 0xaf3ebd70:
             if (p1.equals("colors")) {
                i = 1;
             }
             break;
           case 0xcb3dace8:
             if (p1.equals("progressBackgroundColor")) {
                i = 2;
             }
             break;
           case 0xe733c5a5:
             if (p1.equals("progressViewOffset")) {
                i = 3;
             }
             break;
           case 0xecd15327:
             if (p1.equals("refreshing")) {
                i = 4;
             }
             break;
           case 0x35e001:
             if (p1.equals("size")) {
                i = 5;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setEnabled(p0, b1);
             break;
           case 1:
             this.a.setColors(p0, p2);
             break;
           case 2:
             ta = this.a;
             p2 = (p2 == null)? null: Integer.valueOf(p2.intValue());
             ta.setProgressBackgroundColor(p0, p2);
             break;
           case 3:
             ta = this.a;
             float f = (p2 == null)? 0: p2.floatValue();
             ta.setProgressViewOffset(p0, f);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setRefreshing(p0, b);
             break;
           case 5:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.intValue();
             }
             ta.setSize(p0, b1);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
