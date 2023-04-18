package cn.yogjun.docking.source.manager.bean.api;

import cn.hutool.core.util.StrUtil;
import cn.yogjun.docking.bean.exceptions.ErrorSourceException;
import cn.yogjun.docking.source.manager.bean.base.SourceSpec;
import lombok.Data;

/**
 * {@link ApiRestSource}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/4/12
 */
@Data
public class ApiRestSource extends SourceSpec {
  /** http method */
  private String method;

  /** url */
  private String url;

  /** json/xml */
  private String dataType;

  @Override
  public void checkSource() {
    if (!StrUtil.isAllNotBlank(this.getMethod(), this.getUrl())) {
      throw new ErrorSourceException(
          ErrorSourceException.Code.SOURCE_FORMAT_ERROR, this.toString());
    }
  }
}
