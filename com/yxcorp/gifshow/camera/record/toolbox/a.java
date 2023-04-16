package com.yxcorp.gifshow.camera.record.toolbox.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import hb0.a;
import java.lang.String;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import lh9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w46.b;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import nyb.h;
import lyb.v;
import com.yxcorp.gifshow.plugin.impl.search.util.SearchLoadPolicy;
import brd.t;
import lh9.b;
import android.app.Activity;
import lh9.c;
import erd.g;
import crd.b;

public final class a implements View$OnClickListener	// class@000f63
{
    public final PostTemplateTabHostFragment b;

    public void a(PostTemplateTabHostFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "on search entrance click", objArray);
       FragmentActivity activity = tb.getActivity();
       PostTemplateTabHostFragment h = tb.H;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(activity, h, Boolean.FALSE, null, d.class, "2")) {
          if (activity instanceof e0) {
             str = "";
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SEARCH_KUAISHAN_TEMPLATE";
             i3 oi3 = i3.f();
             oi3.d("button_text", str);
             uElementPack.params = oi3.e();
             u1.L(str, activity, 1, uElementPack, null);
          }
          str = "PostToolBox";
          if (!activity instanceof GifshowActivity) {
             Object[] objArray1 = new Object[i];
             a.D().t(str, "activity is not GifshowActivity", objArray1);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "start search activity", objArray2);
             SearchEntryParams searchEntryP = SearchEntryParams.Instance().entrySource("search_entrance_flash_inside").setVerticalParams(new SearchVerticalParams().sceneSource(SearchSceneSource.KFLASH).colorMode(2));
             if (!TextUtils.x(h)) {
                searchEntryP.placeHolderKeyword(h);
                searchEntryP.placeHolder(h);
             }
             b.a(0x560d43).g(v.class, SearchLoadPolicy.DIALOG).subscribe(new b(activity, searchEntryP), c.b);
          }
       }
       return;
    }
}
