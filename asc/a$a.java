package asc.a$a;
import com.yxcorp.gifshow.widget.m;
import asc.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;
import com.google.gson.JsonObject;
import lsc.g0;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import lsc.u;
import brd.t;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.g;
import androidx.fragment.app.FragmentActivity;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import asc.a$a$a;
import crd.b;
import e17.i;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;

public final class a$a extends m	// class@0002c3
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Context context = this.c.g.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       g0.f(context, "EXTRACT_PHOTO_MUSIC", null);
       ArrayList uArrayList = new ArrayList(this.c.d.keySet());
       if (uArrayList.isEmpty() ^ 0x01) {
          g.a(uArrayList.get(0), u.a()).subscribe(e.b(this.c.g.getActivity()), a$a$a.b);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f101659);
          i1.c(new RuntimeException("ImportMusicAlbumBottomViewBindererror no media"));
       }
       return;
    }
}
