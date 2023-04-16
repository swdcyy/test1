package com.yxcorp.gifshow.myqrcode.activity.MyQRCodeActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import zf6.l;
import com.yxcorp.gifshow.myqrcode.fragment.MyQRCodeFragment;
import androidx.fragment.app.Fragment;

public class MyQRCodeActivity extends SingleFragmentActivity	// class@0020b1
{
    public MyQRCodeFragment y;
    public static final int z;

    public void MyQRCodeActivity(){
       super();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, MyQRCodeActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.y.f();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MyQRCodeActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, MyQRCodeActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 23) {
          return l.m(0, this.getResources().getColor(0x7f061f26, this.getTheme()));
       }
       return l.m(0, this.getResources().getColor(0x7f061f26));
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, MyQRCodeActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getUrl();
    }
    public Fragment u3(){
       MyQRCodeFragment obj = PatchProxy.apply(null, this, MyQRCodeActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MyQRCodeFragment();
       this.y = obj;
       return obj;
    }
}
