package f4a.a;
import erd.g;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import java.lang.Object;
import wl9.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f4a.v;
import f4a.d0;
import f4a.b0;

public final class a implements g	// class@00229a
{
    public final ApkDownloadHelper b;

    public void a(ApkDownloadHelper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ApkDownloadHelper.class, "1")) {
       }else if(TextUtils.n(p0.a, tb.d.getPackageName())){
          v.b().i(tb.d.getPackageName(), tb.d.getDownloadUrl());
          tb.f(d0.d);
          tb.e("5", tb.d.getTitle());
          tb.c("5", tb.d.getActionIconUrl());
          tb.f.u(1);
       }
       return;
    }
}
