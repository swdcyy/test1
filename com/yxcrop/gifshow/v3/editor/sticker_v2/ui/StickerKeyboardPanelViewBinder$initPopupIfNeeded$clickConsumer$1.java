package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import nmd.q;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import fmd.a;
import qmd.a;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ssd.e;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1 extends Lambda implements l	// class@000a99
{
    public final Ref$ObjectRef $currentTitle;
    public final NewRelayStickerDrawer $element;
    public final q this$0;

    public void StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1(q p0,NewRelayStickerDrawer p1,Ref$ObjectRef p2){
       this.this$0 = p0;
       this.$element = p1;
       this.$currentTitle = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(RelayDataItem p0){
       int type;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1.class, "1")) {
          return;
       }
       a.p(p0, "item");
       if (this.$element.isAdded()) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "StickerKeyboardPanelViewBinder";
          a.D().w(str, "initPopupIfNeeded: on click type="+p0.getType(), objArray);
          type = p0.getType();
          if (type) {
             if (type != 1) {
                if (type != 2) {
                   Object[] objArray1 = new Object[i];
                   a.D().A(str, "initPopupIfNeeded: error type: "+p0.getType(), objArray1);
                }else {
                   this.this$0.j0(this.$element);
                }
             }else {
                Friend friend = p0.getFriend();
                if (friend != null) {
                   a uoa = this.this$0.g0();
                   if (uoa != null) {
                      uoa = uoa.b();
                      if (uoa != null) {
                         uoa.d(new RelayUserInfo(friend.getUserId(), friend.getLocalFile(), friend.getUserAvatar()), p0.isSelected());
                      }
                   }
                }
             }
          }else {
             List topicList = p0.getTopicList();
             if (topicList != null) {
                ArrayList uArrayList = new ArrayList(topicList);
                uArrayList.remove(this.$currentTitle.element);
                StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1 t$currentTit = this.$currentTitle;
                String str1 = CollectionsKt___CollectionsKt.v4(uArrayList, e.b);
                if (str1 == null) {
                   str1 = "";
                }
                t$currentTit.element = str1;
                a uoa1 = this.this$0.g0();
                if (uoa1 != null) {
                   uoa1 = uoa1.b();
                   if (uoa1 != null) {
                      uoa1.f(this.$currentTitle.element);
                   }
                }
             }
          }
       }
    label_00d6 :
       return;
    }
}
