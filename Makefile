path=$(shell pwd)

latest:
	docker build -t caller-application:latest .
