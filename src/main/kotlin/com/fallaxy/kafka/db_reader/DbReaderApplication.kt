package com.fallaxy.kafka.db_reader

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbReaderApplication

fun main(args: Array<String>) {
	runApplication<DbReaderApplication>(*args)
}
