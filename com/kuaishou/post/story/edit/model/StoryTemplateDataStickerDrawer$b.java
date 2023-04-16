package com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class StoryTemplateDataStickerDrawer$b implements ViewTreeObserver$OnPreDrawListener	// class@000b24
{
    public final DecorationContainerView b;
    public final StoryTemplateDataStickerDrawer c;

    public void StoryTemplateDataStickerDrawer$b(StoryTemplateDataStickerDrawer p0,DecorationContainerView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, StoryTemplateDataStickerDrawer$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.getSelectDrawer() == this.c) {
          this.b.R();
       }
       this.c.mDateView.getViewTreeObserver().removeOnPreDrawListener(this);
       return false;
    }
}
