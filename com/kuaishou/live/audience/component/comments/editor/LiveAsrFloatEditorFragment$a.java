package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$a;
import android.widget.AdapterView$OnItemClickListener;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;

public class LiveAsrFloatEditorFragment$a implements AdapterView$OnItemClickListener	// class@000a90
{
    public final LiveAsrFloatEditorFragment b;

    public void LiveAsrFloatEditorFragment$a(LiveAsrFloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, LiveAsrFloatEditorFragment$a.class, "1")) {
          return;
       }
       this.b.W0.h(p0.getItemAtPosition(p2));
       return;
    }
}
