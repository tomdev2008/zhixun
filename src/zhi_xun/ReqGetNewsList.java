// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.5.4 by WSRD Tencent.
// Generated from `zx.jce'
// **********************************************************************

package zhi_xun;

public final class ReqGetNewsList extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "zhi_xun.ReqGetNewsList";
    }

    public String fullClassName()
    {
        return "zhi_xun.ReqGetNewsList";
    }

    public zhi_xun.SessionInfo sessionInfo = null;

    public int lastNewsId = 0;

    public int categoryId = 0;

    public short direction = 0;

    public zhi_xun.SessionInfo getSessionInfo()
    {
        return sessionInfo;
    }

    public void  setSessionInfo(zhi_xun.SessionInfo sessionInfo)
    {
        this.sessionInfo = sessionInfo;
    }

    public int getLastNewsId()
    {
        return lastNewsId;
    }

    public void  setLastNewsId(int lastNewsId)
    {
        this.lastNewsId = lastNewsId;
    }

    public int getCategoryId()
    {
        return categoryId;
    }

    public void  setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public short getDirection()
    {
        return direction;
    }

    public void  setDirection(short direction)
    {
        this.direction = direction;
    }

    public ReqGetNewsList()
    {
    }

    public ReqGetNewsList(zhi_xun.SessionInfo sessionInfo, int lastNewsId, int categoryId, short direction)
    {
        this.sessionInfo = sessionInfo;
        this.lastNewsId = lastNewsId;
        this.categoryId = categoryId;
        this.direction = direction;
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        ReqGetNewsList t = (ReqGetNewsList) o;
        return (
            com.qq.taf.jce.JceUtil.equals(sessionInfo, t.sessionInfo) && 
            com.qq.taf.jce.JceUtil.equals(lastNewsId, t.lastNewsId) && 
            com.qq.taf.jce.JceUtil.equals(categoryId, t.categoryId) && 
            com.qq.taf.jce.JceUtil.equals(direction, t.direction) );
    }

    public int hashCode()
    {
        try
        {
            throw new Exception("Need define key first!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    public java.lang.Object clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        if (null != sessionInfo)
        {
            _os.write(sessionInfo, 0);
        }
        _os.write(lastNewsId, 1);
        _os.write(categoryId, 2);
        _os.write(direction, 3);
    }

    static zhi_xun.SessionInfo cache_sessionInfo;

    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        if(null == cache_sessionInfo)
        {
            cache_sessionInfo = new zhi_xun.SessionInfo();
        }
        this.sessionInfo = (zhi_xun.SessionInfo) _is.read(cache_sessionInfo, 0, false);
        this.lastNewsId = (int) _is.read(lastNewsId, 1, false);
        this.categoryId = (int) _is.read(categoryId, 2, false);
        this.direction = (short) _is.read(direction, 3, false);
    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(sessionInfo, "sessionInfo");
        _ds.display(lastNewsId, "lastNewsId");
        _ds.display(categoryId, "categoryId");
        _ds.display(direction, "direction");
    }

}

