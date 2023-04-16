package com.kwai.feature.post.api.feature.kuaishan.model.CollectionTemplateData;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class CollectionTemplateData implements Serializable, Cloneable	// class@00139f
{
    public String mId;
    public List mImages;
    public boolean mIsOffline;
    public int mMaterialCount;
    public String mName;
    public String mScheme;
    public long mUseCount;
    public static final long serialVersionUID = 0x1;

    public void CollectionTemplateData(){
       super();
    }
}
