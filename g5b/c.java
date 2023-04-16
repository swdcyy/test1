package g5b.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import com.yxcorp.gifshow.model.MagicEmoji$a;
import s5b.b;
import java.lang.String;
import q87.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import e17.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.MagicSeekbarSwitcher;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import w46.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Float;
import java.util.Map;
import java.lang.Runnable;
import com.yxcorp.utility.n;
import android.util.Pair;
import mrd.a;

public final class c implements View$OnClickListener	// class@002a7d
{
    public final h b;

    public void c(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h h;
       boolean b;
       int b1;
       c tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       String str = "MagicEmojiSeekBar";
       if (tb.X8(tb.H) == null) {
          Object[] objArray = new Object[0];
          b.D().w(str, "click1 when config is null", objArray);
          ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
          uExceptionEv.extraMessage = "MagicSeekBar1 "+tb.H;
          ExceptionHandler.handleCaughtException(new Throwable("MagicSeekBar"), uExceptionEv);
       }else if(tb.X8(tb.H).e()){
          i.a(R.style.arg_RES_7f11066a, 0x7f103958);
       }else if(tb.F.Q()){
          Object[] objArray1 = new Object[0];
          b.D().s(str, "animating", objArray1);
       }else {
          h = tb.H;
          MagicEmoji$a obj = PatchProxy.applyOneRefs(h, tb, oh, "22");
          b = true;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(tb.J == h){
             obj = tb.X8(h);
             if (obj == null || !obj.e()) {
                tb.J = h;
                b1 = true;
             }
          }
          b1 = false;
          if (b1) {
             tb.o9(b);
             tb.m9();
          }else if(PatchProxy.applyVoid(null, tb, oh, "23")){
             b1 = tb.E.getProgress();
             MagicEmoji$a uoa = tb.X8(tb.J);
             if (uoa == null) {
                Object[] objArray2 = new Object[0];
                b.D().t(str, "non config", objArray2);
             }else {
                tb.K = b;
                SimpleMagicFace mId = tb.N.mId;
                h j = tb.J;
                Object[] objArray3 = PatchProxy.applyTwoRefs(mId, j, tb, oh, "18");
                if (objArray3 != patchProxyRe) {
                }else {
                   Map map = tb.M.get(mId);
                   objArray3 = (map == null)? null: map.get(j);
                }
                if (objArray3 != null && objArray3.floatValue()) {
                   tb.E.setProgress((int)(objArray3.floatValue() * (float)tb.E.getMaxProgress()));
                }else {
                   tb.E.setProgress((int)(uoa.b() * (float)tb.E.getMaxProgress()));
                }
                tb.Y8();
                tb.j9(b, uoa);
                float f = (float)tb.E.getProgress() / (float)tb.E.getMaxProgress();
                uoa.g(f, b);
                if ((double)f > 0) {
                   tb.h9(tb.N.mId, tb.J, f);
                   tb.d9(tb.N.mId, tb.J);
                }else {
                   tb.h9(tb.N.mId, tb.J, f);
                   tb.e9(tb.N.mId, tb.J, ((float)b1 / (float)tb.E.getMaxProgress()));
                }
                if (!uoa.c() - uoa.b()) {
                   b = false;
                }
                tb.O = b;
                tb.n9(tb.E.getProgress());
                tb.K = false;
             }
          }
          tb.E.removeCallbacks(tb.R);
          if (!tb.E.getVisibility()) {
             tb.a9();
          }else if(PatchProxy.applyVoid(null, tb, oh, "28")){
             n.Y(tb.E, 0, 0);
             tb.E.postDelayed(tb.R, 3000);
             tb.C.onNext(new Pair("SEEK_BAR_SHOW_EVENT", Boolean.TRUE));
          }
       }
       return;
    }
}
