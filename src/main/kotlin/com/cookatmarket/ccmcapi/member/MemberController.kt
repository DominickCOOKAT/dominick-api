package com.cookatmarket.ccmcapi.member

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/members")
class MemberController {

    @GetMapping("")
    fun getMembers(): String = "Hello"
}