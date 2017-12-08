package cn.com.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author lsh
 * @ApiModelProperty 这里顾名思义，就是标注在被标注了@ApiModel的class的属性上，
 *这里的value是对字段的描述，example是取值例子，注意这里的example很有用，对于前后端开发工程师理解文档起到了关键的作用，
 *因为会在api文档页面上显示出这些取值来；这个注解还有一些字段取值，可以自己研究，举例说一个：position，
 *表明字段在model中的顺序
 */
@ApiModel(description = "公告对象类")
public class B2bNoticePublishQuery
{
    @ApiModelProperty(value = "id",position = 1,allowableValues="1,2,3")
    private Long id;
    @ApiModelProperty(value = "标题,", example = "测试")
    private String title;
    @ApiModelProperty(value = "置顶", example = "0")
    private String top;
    private String publishTime;
    private String valid;
    @ApiModelProperty(value = "链接", example = "http：baidu")
    private String url;
    private String createBy;
    private String createTime;
    @ApiModelProperty(value = "操作人", example = "0",hidden = true)
    private String opBy;
    private String opTime;
    private String content;
    private String hidmainPic; //图片地址

    public String getHidmainPic() {
        return hidmainPic;
    }

    public void setHidmainPic(String hidmainPic) {
        this.hidmainPic = hidmainPic;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTop()
    {
        return top;
    }

    public void setTop(String top)
    {
        this.top = top;
    }

    public String getPublishTime()
    {
        return publishTime;
    }

    public void setPublishTime(String publishTime)
    {
        this.publishTime = publishTime;
    }

    public String getValid()
    {
        return valid;
    }

    public void setValid(String valid)
    {
        this.valid = valid;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getCreateBy()
    {
        return createBy;
    }

    public void setCreateBy(String createBy)
    {
        this.createBy = createBy;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getOpBy()
    {
        return opBy;
    }

    public void setOpBy(String opBy)
    {
        this.opBy = opBy;
    }

    public String getOpTime()
    {
        return opTime;
    }

    public void setOpTime(String opTime)
    {
        this.opTime = opTime;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}
