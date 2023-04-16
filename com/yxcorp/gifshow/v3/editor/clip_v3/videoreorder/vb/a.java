package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.a;
import msd.l;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LiveData;
import jpc.a;
import java.util.List;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import lpc.d;
import n3d.a;

public final class a implements l	// class@000e0a
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.c.getActivity() != null) {
          p0 = tb.c.getActivity();
          Intent intent = PatchProxy.apply(null, tb, b.class, "10");
          if (intent != PatchProxyResult.class) {
          }else {
             intent = ClipUtils.a(tb.c.getActivity(), (long)(tb.s.getDisplayDuration() * 0x408f400000000000), tb.q.r0().getValue().f().size());
          }
          p0.t1(intent, 0x2711, new d(tb));
          tb.c.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f010115);
       }
       return null;
    }
}
