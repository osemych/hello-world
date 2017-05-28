#!/bin/sh env

echo "Job complete on node: $(hostname) ($(hostname -I | awk '{print $2}'))"
