package com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveAudienceGiftAchievementRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.View;

public class LiveAudienceGiftAchievementRecyclerView extends RecyclerView	// class@000b78
{
    public boolean b;
    public boolean c;
    public boolean d;

    public void LiveAudienceGiftAchievementRecyclerView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceGiftAchievementRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftAchievementRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.c = false;
       this.d = false;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftAchievementRecyclerView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoid(null, this, LiveAudienceGiftAchievementRecyclerView.class, "2")) {
          LinearLayoutManager layoutManage = this.getLayoutManager();
          if (layoutManage != null) {
             boolean b = false;
             int i1 = 0;
             for (boolean i = 0; i < this.getChildCount(); i = i + 1) {
                i1 = i1 + this.getChildAt(i).getMeasuredWidth();
             }
             i = (layoutManage.h())? true: false;
             this.c = i;
             boolean b1 = (layoutManage.E() != (layoutManage.getItemCount() - 1))? true: false;
             this.d = b1;
             if (i1 > this.getMeasuredWidth()) {
                b = true;
             }
             this.b = b;
          }
       }
       return;
    }
}
