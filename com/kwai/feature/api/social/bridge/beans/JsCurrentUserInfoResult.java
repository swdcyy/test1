package com.kwai.feature.api.social.bridge.beans.JsCurrentUserInfoResult;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import java.util.Map;

public class JsCurrentUserInfoResult implements Serializable	// class@00108c
{
    public Map mJsonMap;
    public static final long serialVersionUID = 0xf805bd5006cf61da;

    public void JsCurrentUserInfoResult(){
       super();
       HashMap hashMap = new HashMap();
       this.mJsonMap = hashMap;
       hashMap.put("headurl", QCurrentUser.me().getAvatar());
       this.mJsonMap.put("user_id", QCurrentUser.me().getId());
       this.mJsonMap.put("user_name", QCurrentUser.me().getName());
       this.mJsonMap.put("user_sex", QCurrentUser.me().getSex());
       this.mJsonMap.put("user_text", QCurrentUser.me().getText());
    }
}
