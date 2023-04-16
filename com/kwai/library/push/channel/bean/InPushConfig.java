package com.kwai.library.push.channel.bean.InPushConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.push.channel.bean.BizConfig;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import ny6.a;
import android.util.Base64;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Map;
import com.google.gson.Gson;

public class InPushConfig implements Serializable	// class@0008a2
{
    public String blackList;
    public List mBizConfigs;
    public Map pageMap;
    public static final long serialVersionUID = 0x48a6a136523e559e;

    public void InPushConfig(){
       super();
    }
    public BizConfig getBizConfig(String p0){
       BizConfig uBizConfig;
       InPushConfig tmBizConfigs = this.mBizConfigs;
       if (tmBizConfigs != null && tmBizConfigs.size()) {
          Iterator iterator = this.mBizConfigs.iterator();
          while (true) {
             if (iterator.hasNext()) {
                uBizConfig = iterator.next();
                if (uBizConfig != null && TextUtils.equals(uBizConfig.mBizType, p0)) {
                   if (TextUtils.isEmpty(uBizConfig.blackList)) {
                      uBizConfig.blackList = this.blackList;
                      break ;
                   }
                   break ;
                }
             }
          }
          return uBizConfig;
       }
       return null;
    }
    public List getPageIds(String p0){
       a.b("encodeStr:"+p0);
       byte[] uobyteArray = Base64.decode(p0, 0);
       a.b("byteStr:"+new String(uobyteArray));
       ArrayList uArrayList = new ArrayList();
       StringBuilder str = "";
       int i = 0;
       while (i < uobyteArray.length) {
          int i1 = 0;
          while (i1 < 8) {
             int i2 = 1;
             int i3 = i2 << i1;
             int i4 = uobyteArray[i] & i3;
             i4 = (!i4)? 1: 0;
             i4 = i4 ^ i2;
             if (i4) {
                str = str+"1";
                i2 = i * 8;
                i2 = i2 + i1;
                uArrayList.add(this.pageMap.get(Integer.valueOf(i2)));
             }else {
                str = str+"0";
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       a.b("encodeBitData:"+str);
       a.b("page_num:"+new Gson().q(this.pageMap));
       a.b("page_result:"+new Gson().q(uArrayList));
       return uArrayList;
    }
    public String toString(){
       return "InPushConfig{pageMap="+this.pageMap+", blackList=\'"+this.blackList+'''+", confs="+this.mBizConfigs+'}';
    }
}
