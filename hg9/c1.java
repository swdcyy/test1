package hg9.c1;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.p;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.content.Intent;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class c1 implements g	// class@002651
{
    public final p b;
    public final ProgressFragment c;
    public final Intent d;

    public void c1(p p0,ProgressFragment p1,Intent p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c1 tb = this.b;
       c1 tc = this.c;
       c1 td = this.d;
       if (tb.j != null) {
          tc.dismiss();
          td.setData(w0.f(p0.getAbsolutePath()));
          tb.d().setResult(-1, td);
          tb.d().finish();
          Object[] objArray = new Object[0];
          a.D().w(tb.a, "CameraDirectoryPath = "+p0.getAbsolutePath(), objArray);
       }
       return;
    }
}
