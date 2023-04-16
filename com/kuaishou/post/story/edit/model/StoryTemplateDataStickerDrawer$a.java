package com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData;
import android.widget.TextView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;

public class StoryTemplateDataStickerDrawer$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000b23
{
    public final DecorationContainerView b;
    public final StoryTemplateDataStickerDrawer c;

    public void StoryTemplateDataStickerDrawer$a(StoryTemplateDataStickerDrawer p0,DecorationContainerView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, StoryTemplateDataStickerDrawer$a.class, "1")) {
          return;
       }
       StoryTemplateDataStickerDrawer$a tc = this.c;
       tc.mBaseDrawerData.M((float)tc.mDateView.getHeight());
       tc = this.c;
       tc.mBaseDrawerData.P((float)tc.mDateView.getWidth());
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.update();
       return;
    }
}
