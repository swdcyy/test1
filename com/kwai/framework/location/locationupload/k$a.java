package com.kwai.framework.location.locationupload.k$a;
import com.kwai.framework.location.locationupload.d$a;
import com.kwai.framework.location.locationupload.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class k$a implements d$a	// class@001647
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, k.class, "4") && !TextUtils.isEmpty(p0)) {
          ta.f = p0;
          g.a(ta.g.edit().putString("location_upload_action_last_query_info", p0));
       }
       return;
    }
    public String b(){
       return this.a.f;
    }
}
