package com.yxcorp.gifshow.model.response.MusicCategoriesResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class MusicCategoriesResponse implements b, Serializable	// class@001f4a
{
    public List mCategories;
    public static final long serialVersionUID = 0x4e416ca8d8cc413b;

    public void MusicCategoriesResponse(){
       super();
    }
    public List getItems(){
       return this.mCategories;
    }
    public boolean hasMore(){
       return false;
    }
}
