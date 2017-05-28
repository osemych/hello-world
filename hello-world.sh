#!/bin/sh env

echo "Job complete on node: $(hostname) ($(hostname -I | awk -e 'print ${2}'))"
