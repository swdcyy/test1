package com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordsResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class SensitiveWordsResponse implements Serializable	// class@000f52
{
    public List mWords;
    public static final long serialVersionUID = 0xd085c31165580362;

    public void SensitiveWordsResponse(){
       super();
       this.mWords = new ArrayList();
    }
}
