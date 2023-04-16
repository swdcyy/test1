package com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment$a;
import android.widget.AdapterView$OnItemClickListener;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
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

public class FloatEditorFragment$a implements AdapterView$OnItemClickListener	// class@0011f6
{
    public final FloatEditorFragment b;

    public void FloatEditorFragment$a(FloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       if (PatchProxy.isSupport(FloatEditorFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, FloatEditorFragment$a.class, "1")) {
          return;
       }
       this.b.W0.h(p0.getItemAtPosition(p2));
       return;
    }
}
