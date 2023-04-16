package ae9.b;
import erd.g;
import com.yxcorp.gifshow.camera.record.live.LiveEntryWrapperFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.System;
import java.lang.String;
import qs5.a;
import j8c.a;
import q87.c;
import android.view.View;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import os5.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import w46.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class b implements g	// class@0000ac
{
    public final LiveEntryWrapperFragment b;

    public void b(LiveEntryWrapperFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       b tb = this.b;
       Objects.requireNonNull(tb);
       long l = System.currentTimeMillis() - tb.o;
       if (l - null > 0) {
          a.b("LIVE_ENTRY", l, tb.q, p0.booleanValue());
       }
       String str = "LiveEntryWrapperFragment";
       int i = 8;
       int i1 = 0;
       if (p0.booleanValue()) {
          objArray = new Object[i1];
          a.D().w(str, "install live_anchor_plugin success", objArray);
          tb.l.setVisibility(i);
          tb.j.setVisibility(i);
          tb.k.setVisibility(i);
          if (tb.getChildFragmentManager().findFragmentById(0x7f0a1c37) == null) {
             p0 = d.a(0x3652a147).EN();
             tb.n = p0;
             if (tb.getArguments() != null) {
                Object[] objArray1 = new Object[i1];
                a.D().w(str, "live prepareCameraItemFragmentArguments, transfer arguments", objArray1);
                p0.setArguments(tb.getArguments());
             }
             e uoe = tb.getChildFragmentManager().beginTransaction();
             uoe.f(R.id.live_entry_wrapper_fragment_container, p0);
             uoe.m();
          }
          PluginDownloadExtension.k.a("live_anchor_plugin");
       }else {
          objArray = new Object[i1];
          a.D().t(str, "install live_anchor_plugin fail", objArray);
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100a3e));
          tb.l.setVisibility(i1);
          tb.j.setVisibility(i);
          tb.k.setVisibility(i1);
       }
       return;
    }
}
