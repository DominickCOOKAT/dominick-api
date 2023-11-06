package com.cookatmarket.ccmcapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.cookatmarket.*")
class CcmcApiApplication

fun main(args: Array<String>) {
	runApplication<CcmcApiApplication>(*args)
}
