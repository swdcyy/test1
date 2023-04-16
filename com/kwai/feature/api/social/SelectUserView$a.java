package com.kwai.feature.api.social.SelectUserView$a;
import hka.a;
import com.kwai.feature.api.social.SelectUserView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;

public class SelectUserView$a implements a	// class@00107e
{
    public final SelectUserView b;

    public void SelectUserView$a(SelectUserView p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, SelectUserView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.b.getVisibility())? true: false;
       return b;
    }
}
