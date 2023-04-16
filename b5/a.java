package b5.a;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.LocaleList;

public class a extends Paint	// class@000adb
{

    public void a(){
       super();
    }
    public void a(int p0){
       super(p0);
    }
    public void a(int p0,PorterDuff$Mode p1){
       super(p0);
       this.setXfermode(new PorterDuffXfermode(p1));
    }
    public void a(PorterDuff$Mode p0){
       super();
       this.setXfermode(new PorterDuffXfermode(p0));
    }
    public void setTextLocales(LocaleList p0){
    }
}
