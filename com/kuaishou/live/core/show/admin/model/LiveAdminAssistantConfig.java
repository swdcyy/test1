package com.kuaishou.live.core.show.admin.model.LiveAdminAssistantConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;

public class LiveAdminAssistantConfig implements Serializable	// class@0009b5
{
    public List mAllAbilities;
    public Map mSceneConfig;
    public static final long serialVersionUID = 0x322acda201c78ef8;

    public void LiveAdminAssistantConfig(){
       super();
    }
    public Map getSceneAbilityConfig(){
       return this.mSceneConfig;
    }
}
