package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$b;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import java.lang.Object;
import b5b.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.ref.WeakReference;

public final class MagicSearchBarPresenter$b implements g	// class@001bf9
{
    public final MagicSearchBarPresenter b;

    public void MagicSearchBarPresenter$b(MagicSearchBarPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$b.class, "1")) {
       }else if(p0.a != null){
          MagicSearchBarPresenter$b tb = this.b;
          p0 = p0.b;
          Objects.requireNonNull(tb);
          MagicSearchBarPresenter magicSearchB = MagicSearchBarPresenter.class;
          if (!PatchProxy.isSupport(magicSearchB) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tb, magicSearchB, "13")) {
             MagicSearchBarFragment magicSearchB1 = new MagicSearchBarFragment();
             Bundle uBundle = new BaseEditorFragment$Arguments().setEnableAtFriends(false).setMonitorTextChange(false).setCancelWhileKeyboardHidden(true).setDismissAfterEntryComplete(false).setShowLeftBtn(false).setShowEmojiFirst(false).setEnableEmoji(false).setHintText(null).build();
             MagicSearchBarPresenter x = tb.x;
             if (x == null) {
                a.S("magicSource");
             }
             SerializableHook.putSerializable(uBundle, "magic_source", x);
             x = tb.y;
             if (x == null) {
                a.S("magicPageId");
             }
             SerializableHook.putSerializable(uBundle, "magic_page_id", x);
             uBundle.putBoolean("magic_search_bar_is_auto_show", p0);
             p0 = tb.z;
             String str = "magicSearchPanelFragment";
             if (p0 == null) {
                a.S(str);
             }
             if (p0.jh() != null) {
                p0 = tb.z;
                if (p0 == null) {
                   a.S(str);
                }
                SerializableHook.putSerializable(uBundle, "magic_emoji_page_config", p0.jh());
             }
             magicSearchB1.setArguments(uBundle);
             magicSearchB1.X0 = tb.B;
             p0 = tb.w;
             if (p0 == null) {
                a.S("searchKeywordConfirmListener");
             }
             magicSearchB1.Y0 = p0;
             p0 = tb.getActivity();
             Objects.requireNonNull(p0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             Objects.requireNonNull(MagicSearchBarFragment.k1);
             magicSearchB1.Cb(p0.getSupportFragmentManager(), MagicSearchBarFragment.i1);
             tb.v = new WeakReference(magicSearchB1);
          }
       }else {
          this.b.P8();
       }
       return;
    }
}
