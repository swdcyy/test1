package com.kuaishou.post.story.widget.StoryEditText$a$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.post.story.widget.StoryEditText$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import rp4.a;
import q87.c;
import java.lang.CharSequence;
import com.kuaishou.post.story.widget.StoryEditText;
import android.text.TextWatcher;

public class StoryEditText$a$a implements ViewTreeObserver$OnPreDrawListener	// class@000b8c
{
    public final String b;
    public final int c;
    public final StoryEditText$a d;

    public void StoryEditText$a$a(StoryEditText$a p0,String p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean onPreDraw(){
       StoryEditText$a obj = PatchProxy.apply(null, this, StoryEditText$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.d.b.getViewTreeObserver().removeOnPreDrawListener(this);
       int i = 0;
       if (this.d.b.getLineCount() > this.d.b.getMaxLines()) {
          Object[] objArray = new Object[i];
          a.D().s("StoryEditText", "Line or character limit exceeded, roll back.", objArray);
          this.d.b.setText(this.b);
          this.d.b.setSelection(this.c);
          i = 1;
       }else {
          this.d.b.setLineSpacing(0, 0x3f800000);
          this.d.b.setLineSpacing(this.d.b.getLineSpacingExtra(), this.d.b.getLineSpacingMultiplier());
       }
       obj = this.d.b;
       obj.addTextChangedListener(obj.g);
       return (i ^ 0x01);
    }
}
