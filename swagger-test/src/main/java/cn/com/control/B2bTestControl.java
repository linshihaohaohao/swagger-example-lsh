package cn.com.control;

import cn.com.entity.B2bNoticePublishQuery;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsh on 2017/12/7.
 */
@Api(value = "测试swagger Control", description = "测试swagger Control")
@RestController
@CrossOrigin
@RequestMapping("/b2bTest")
public class B2bTestControl {
    //当前数据类型
    private final String APP_TYPE = "b2bMall";



    @ApiOperation(value="获取帮助内容详细信息", notes="根据url的id来获取帮助内容",consumes="application/x-www-form-urlencoded")
    @GetMapping("view")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    public B2bNoticePublishQuery getInfo(@ApiParam(value = "ID值",defaultValue = "10")@RequestParam(value = "id") Long id) {
        // 处理"/b2bContentInfo/{id}"的GET请求，用来获取url中id值的帮助内容r信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        B2bNoticePublishQuery b2bNoticePublishQuery = new B2bNoticePublishQuery();
        b2bNoticePublishQuery.setCreateBy("dada");
        b2bNoticePublishQuery.setContent("测试");
        return b2bNoticePublishQuery;
    }


    @ApiOperation(value="获取公告", notes="获取公告内容")
    @GetMapping("list")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    public List<B2bNoticePublishQuery> list(@ApiParam(value = "B2bNoticePublishQuery对象")B2bNoticePublishQuery query) {
        List<B2bNoticePublishQuery> list =new ArrayList<>();
        for(int i=0;i<=10; i++){
            B2bNoticePublishQuery b2bNoticePublishQuery = new B2bNoticePublishQuery();
            b2bNoticePublishQuery.setCreateBy("dada");
            b2bNoticePublishQuery.setContent("测试丝袜哥");
            b2bNoticePublishQuery.setTitle("标题");
        }
        return list;
    }

    /**
     * @ApiOperation 标注在具体请求上，value和notes的作用差不多，都是对请求进行说明；tags则是对请求进行分类的，
     * 比如你有好几个controller，分别属于不同的功能模块，那这里我们就可以使用tags来区分了，看上去很有条理
     * @param b2bNoticePublishQuery
     * @return
     */
    @ApiOperation(value="更新公告详细信息", notes="根据url的id来指定更新对象，并根据传过来的MallAppContentInfoDto信息来更新帮助内容详细信息",consumes="application/x-www-form-urlencoded")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "b2bNoticePublishQuery", value = "帮助详细实体B2bNoticePublishQuery", required = true, dataType = "B2bNoticePublishQuery")
    })

    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("updateInfo")
    public String updateInfo(@ApiParam(value = "B2bNoticePublishQuery对象")B2bNoticePublishQuery b2bNoticePublishQuery ) {
        return "success";
    }
}
