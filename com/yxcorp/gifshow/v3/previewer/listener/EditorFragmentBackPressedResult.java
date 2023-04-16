package com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorFragmentBackPressedResult extends Enum	// class@0015df
{
    public static final EditorFragmentBackPressedResult[] $VALUES;
    public static final EditorFragmentBackPressedResult INTERCEPT_EVENT;
    public static final EditorFragmentBackPressedResult PASS_EVENT;

    static {
       EditorFragmentBackPressedResult uEditorFragm1;
       EditorFragmentBackPressedResult[] uEditorFragm = new EditorFragmentBackPressedResult[]{uEditorFragm1,uEditorFragm1};
       uEditorFragm1 = new EditorFragmentBackPressedResult("INTERCEPT_EVENT", 0);
       EditorFragmentBackPressedResult.INTERCEPT_EVENT = uEditorFragm1;
       uEditorFragm1 = new EditorFragmentBackPressedResult("PASS_EVENT", 1);
       EditorFragmentBackPressedResult.PASS_EVENT = uEditorFragm1;
       EditorFragmentBackPressedResult.$VALUES = uEditorFragm;
    }
    public void EditorFragmentBackPressedResult(String p0,int p1){
       super(p0, p1);
    }
    public static EditorFragmentBackPressedResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorFragmentBackPressedResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorFragmentBackPressedResult.class, p0);
    }
    public static EditorFragmentBackPressedResult[] values(){
       Object obj = PatchProxy.apply(null, null, EditorFragmentBackPressedResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorFragmentBackPressedResult.$VALUES.clone();
    }
}
