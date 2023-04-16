package com.tachikoma.core.component.input.TKInput$f;
import com.tachikoma.core.component.input.MenuOptionEditText$a;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;

public class TKInput$f implements MenuOptionEditText$a	// class@000d76
{
    public final TKInput a;

    public void TKInput$f(TKInput p0){
       this.a = p0;
       super();
    }
    public void a(){
       this.a.mIsClickCut = true;
    }
    public void b(){
       this.a.mIsClickCopy = true;
    }
    public void c(){
       this.a.mIsClickPaste = true;
    }
}
