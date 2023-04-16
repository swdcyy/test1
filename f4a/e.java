package f4a.e;
import erd.g;
import com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper;
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
import o4a.b;

public final class e implements g	// class@0022a2
{
    public final ApkStatusHelper b;

    public void e(ApkStatusHelper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ApkStatusHelper.class, "1")) {
       }else if(TextUtils.n(p0.a, tb.d.getPackageName())){
          v.b().i(tb.d.getPackageName(), tb.d.getDownloadUrl());
          tb.a.a(ApkStatusHelper.i);
       }
       return;
    }
}
