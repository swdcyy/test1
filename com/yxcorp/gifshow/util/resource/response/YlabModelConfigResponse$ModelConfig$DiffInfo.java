package com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import java.lang.CloneNotSupportedException;

public class YlabModelConfigResponse$ModelConfig$DiffInfo implements Cloneable	// class@000cf9
{
    public String mOriginalRawKey;
    public List mUrls;

    public void YlabModelConfigResponse$ModelConfig$DiffInfo(){
       super();
    }
    public boolean a(){
       if (q.f(this.mUrls)) {
          return false;
       }
       Iterator iterator = this.mUrls.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (!TextUtils.x(iterator.next().mUrl)) {
             break ;
          }
       }
       return true;
    }
    public Object clone(){
       try{
          YlabModelConfigResponse$ModelConfig$DiffInfo modelConfig$ = super.clone();
          modelConfig$.mUrls = (this.mUrls != null)? new ArrayList(this.mUrls): new ArrayList();
          return modelConfig$;
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return null;
       }
    }
}
