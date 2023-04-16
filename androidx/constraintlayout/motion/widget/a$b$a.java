package androidx.constraintlayout.motion.widget.a$b$a;
import android.view.View$OnClickListener;
import android.content.Context;
import androidx.constraintlayout.motion.widget.a$b;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.a;

public class a$b$a implements View$OnClickListener	// class@000673
{
    public final a$b b;
    public int c;
    public int d;

    public void a$b$a(Context p0,a$b p1,XmlPullParser p2){
       super();
       this.c = -1;
       this.d = 17;
       this.b = p1;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p2), c$b.I3);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (index == 1) {
             this.c = typedArray.getResourceId(index, this.c);
          }else if(!index){
             this.d = typedArray.getInt(index, this.d);
          }
          i++;
       }
       typedArray.recycle();
       return;
    }
    public void a(MotionLayout p0,int p1,a$b p2){
       a$b$a tc = this.c;
       a$b$a uob$a = -1;
       if (tc == uob$a) {
       }else {
          View view = p0.findViewById(tc);
       }
       if (p0 == null) {
          return;
       }else {
          a$b d = p2.d;
          p2 = p2.c;
          if (d == uob$a) {
             p0.setOnClickListener(this);
             return;
          }else {
             uob$a = this.d;
             int i = uob$a & 0x01;
             int i1 = 0;
             int i2 = (i && p1 == d)? 1: 0;
             int i3 = ((uob$a & 0x0100) && p1 == d)? 1: 0;
             i2 = i2 | i3;
             int i4 = (i && p1 == d)? 1: 0;
             i4 = i4 | i2;
             i = ((uob$a & 0x10) && p1 == p2)? 1: 0;
             i4 = i4 | i;
             if ((uob$a & 0x1000) && p1 == p2) {
                i1 = 1;
             }
             if (i4 | i1) {
                p0.setOnClickListener(this);
             }
             return;
          }
       }
    }
    public boolean b(a$b p0,MotionLayout p1){
       a$b$a tb = this.b;
       boolean b = true;
       if (tb == p0) {
          return b;
       }
       p0 = tb.c;
       a$b d = tb.d;
       if (d == -1) {
          if (p1.F == p0) {
             b = false;
          }
          return b;
       }else {
          p1 = p1.F;
          if (p1 != d && p1 != p0) {
             b = false;
          }
          return b;
       }
    }
    public void c(MotionLayout p0){
       a$b$a tc = this.c;
       if (tc == -1) {
          return;
       }
       View view = p0.findViewById(tc);
       if (view == null) {
          return;
       }
       view.setOnClickListener(null);
       return;
    }
    public void onClick(View p0){
       a a = this.b.j.a;
       if (!a.a0()) {
          return;
       }
       a$b$a tb = this.b;
       a$b$a uob$a = -1;
       if (tb.d == uob$a) {
          int currentState = a.getCurrentState();
          if (currentState == uob$a) {
             a.n0(this.b.c);
             return;
          }else {
             uob$a = this.b;
             a$b uob = new a$b(uob$a.j, uob$a);
             uob.d = currentState;
             uob.c = this.b.c;
             a.setTransition(uob);
             a.l0();
             return;
          }
       }else {
          a c = tb.j.c;
          uob$a = this.d;
          int i = 0;
          int i1 = ((uob$a & 0x01) || (uob$a & 0x0100))? 1: 0;
          uob$a = ((uob$a & 0x10) || (uob$a & 0x1000))? 1: 0;
          int i2 = (i1 && uob$a)? 1: 0;
          if (i2) {
             if (c != tb) {
                a.setTransition(tb);
             }
             if (a.getCurrentState() != a.getEndState() && a.getProgress() - 0x3f000000 <= 0) {
                i = i1;
                uob$a = 0;
             }
          }else {
             i = i1;
          }
          if (this.b(c, a)) {
             if (i && (this.d & 1)) {
                a.setTransition(this.b);
                a.l0();
             }else if(uob$a && (this.d & 0x10)){
                a.setTransition(this.b);
                a.m0();
             }else if(i && (this.d & 0x0100)){
                a.setTransition(this.b);
                a.setProgress(0x3f800000);
             }else if(uob$a && (this.d & 0x1000)){
                a.setTransition(this.b);
                a.setProgress(0);
             }
          }
          return;
       }
    }
}
