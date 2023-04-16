package ooc.r0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.String;

public interface abstract r0	// class@003413
{

    void Z();
    void b(c p0);
    void c(View p0,Bundle p1,BaseEditorFragment p2);
    void d(a p0);
    void d0();
    void e(boolean p0);
    List f();
    void g(int p0);
    void h(EditorBasePreviewFragment p0,c p1);
    void i();
    List j(h p0,boolean p1);
    void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4);
    void onActivityDestroy();
    void onActivityResume();
    void p(boolean p0);
    void s(Bundle p0);
    void u(boolean p0,String p1);
}
