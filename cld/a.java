package cld.a;
import erd.g;
import com.yxcorp.wxapi.WXPayEntryBaseActivity;
import java.lang.Object;
import eda.c0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements g	// class@00033c
{
    public final WXPayEntryBaseActivity b;

    public void a(WXPayEntryBaseActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, WXPayEntryBaseActivity.class, "11")) {
       }else {
          tb.finish();
       }
       return;
    }
}
