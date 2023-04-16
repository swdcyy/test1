package com.kuaishou.live.core.voiceparty.micseats.dialog.d;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import com.kwai.library.widget.viewpager.GridViewPager;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$b;
import xz6.d;
import com.kuaishou.live.core.voiceparty.emoji.model.VoicePartyEmojiListResponse$VoicePartyEmoji;
import java.lang.Long;
import java.util.List;

public class d extends ViewPager$l	// class@0015a0
{
    public final LiveVoicePartyActionPanelFragment b;

    public void d(LiveVoicePartyActionPanelFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0 < this.b.z.getChildCount()) {
          this.b.z.setPageIndex(p0);
       }
       int pageSize = this.b.v.getPageSize();
       int i = p0 * pageSize;
       p0++;
       pageSize = (pageSize * p0) - 1;
       ArrayList uArrayList = new ArrayList();
       while (i < this.b.A.getCount() && i <= pageSize) {
          VoicePartyEmojiListResponse$VoicePartyEmoji item = this.b.A.getItem(i);
          if (item != null) {
             uArrayList.add(Long.valueOf(item.mId));
          }
          i = i + 1;
       }
       this.b.Bh(uArrayList, p0);
       return;
    }
}
