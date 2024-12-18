package com.work.refactor.api.auth.feign;

import com.work.refactor.api.auth.dto.LoginDto;
import com.work.refactor.api.auth.vo.TokenInfoVo;
import com.work.refactor.commom.core.feign.FeignConfig;
import com.work.refactor.commom.core.model.vo.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginApi
 *
 * @author zhoug
 * @date 2024/12/11 23:34
 */
@FeignClient
@RequestMapping(FeignConfig.FEIGN_PREFIX)
public interface LoginFeign {
    @PostMapping("/login")
    public BaseResult<TokenInfoVo> login(LoginDto loginDto);
}
