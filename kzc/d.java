package kzc.d;
import p07.c;
import u07.t$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.exception.KwaiPopupBuildException;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import java.lang.Object;
import p07.e;
import u07.t;
import s07.c;
import p07.b;
import com.kwai.library.widget.popup.common.e;
import java.lang.StringBuilder;

public class d extends t$a implements c	// class@002d0e
{
    public String B0;
    public int C0;
    public e D0;
    public KwaiDialogOption E0;
    public final PopupInterface$Excluded F0;

    public void d(Activity p0){
       super(p0);
       this.C0 = -1;
       this.F0 = this.u;
    }
    public c$b D(PopupInterface$Excluded p0){
       super.D(p0);
       return this;
    }
    public c X(){
       if (this.C0 >= null || (this.E0 != null && this.u != this.F0)) {
          Log.e("", "", new KwaiPopupBuildException("ExcludeType not working. DialogManager deal with it with KwaiDialogOption"));
       }
       return super.X();
    }
    public KwaiDialogOption Y0(){
       return this.E0;
    }
    public d Z0(int p0){
       this.a1(null, p0);
       return this;
    }
    public Object a(String p0,int p1){
       this.a1(p0, p1);
       return this;
    }
    public d a1(String p0,int p1){
       this.C0 = p1;
       this.B0 = p0;
       return this;
    }
    public e b(){
       return this.D0;
    }
    public t b0(){
       this.c();
       return super.b0();
    }
    public d b1(KwaiDialogOption p0){
       this.E0 = p0;
       return this;
    }
    public void c(){
       if (this.D0 == null) {
          this.D0 = new c(this.a);
       }
       return;
    }
    public d c1(e p0){
       this.D0 = p0;
       return this;
    }
    public int d(){
       return this.C0;
    }
    public Object e(e p0){
       this.c1(p0);
       return this;
    }
    public Object f(Object p0){
       p0 = (p0 != null)? e.e(p0).a(p0): null;
       this.c1(p0);
       return this;
    }
    public String g(){
       return this.B0;
    }
    public Object h(int p0){
       this.Z0(p0);
       return this;
    }
    public Object i(){
       return this.Y0();
    }
    public c j(Object p0){
       this.b1(p0);
       return this;
    }
    public c k(){
       return this.b0();
    }
    public String toString(){
       return "KwaiDialogBuilder{mConfigId="+this.C0+", mObservable="+this.D0+", mDefaultConfig="+this.E0+'}';
    }
}
