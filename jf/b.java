package jf.b;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.c;
import java.lang.Double;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;
import java.lang.Boolean;

public class b extends a	// class@0023fa
{

    public void b(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = true;
       int i = 0;
       int i1 = -1;
       switch (p1.hashCode()){
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i1 = 0;
             }
             break;
           case 0xc5995964:
             if (p1.equals("prompt")) {
                i1 = 1;
             }
             break;
           case 0x5a72f63:
             if (p1.equals("color")) {
                i1 = 2;
             }
             break;
           case 0x5fde7c0:
             if (p1.equals("items")) {
                i1 = 3;
             }
             break;
           case 0x4705f29b:
             if (p1.equals("selected")) {
                i1 = 4;
             }
             break;
           default:
       }
       switch (i1){
           case 0:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setEnabled(p0, b);
             break;
           case 1:
             ta = this.a;
             if (p2 == null) {
                p2 = "";
             }else {
             }
             ta.setPrompt(p0, p2);
             break;
           case 2:
             ta = this.a;
             p2 = (p2 == null)? null: Integer.valueOf(p2.intValue());
             ta.setColor(p0, p2);
             break;
           case 3:
             this.a.setItems(p0, p2);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                i = p2.intValue();
             }
             ta.setSelected(p0, i);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
